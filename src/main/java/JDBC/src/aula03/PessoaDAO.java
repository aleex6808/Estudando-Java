package aula03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import aula01.ConexaoUtil;
import aula02.PessoaDTO;

public class PessoaDAO {

	public void insert(PessoaDTO pessoaDTO) throws ClassNotFoundException, SQLException {
		try {
			
			Connection connection = ConexaoUtil.getInstance().getConecction();

			String sql = "INSERT INTO clientes(nome, email) VALUES(?, ?)";

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, pessoaDTO.getNome());
			statement.setString(2, pessoaDTO.getEmail());
			
			if(pessoaDTO.getEmail() != null) {
			statement.execute();
			connection.close();
			
			System.out.println("INSERIDO COM SUCESSO!!!");
			} else {
				System.out.println("valor null");
			}
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remove(int idPessoa) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConecction();
			
			String sql = "DELETE FROM clientes WHERE id = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, idPessoa);
			statement.execute();
			System.out.println("REMOVIDO COM SUCESSO!!!");
			statement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<PessoaDTO> listAll() {
		List<PessoaDTO> listaPessoas = new ArrayList<PessoaDTO> () ;
		
		try {
			Connection connection = ConexaoUtil.getInstance().getConecction();
			
			String sql = "SELECT * FROM clientes";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			 ResultSet resultset = statement.executeQuery();
			 
			 while (resultset.next()) {
				 PessoaDTO pessoaDTO = new PessoaDTO();
				 pessoaDTO.setId(resultset.getInt("id"));
				 pessoaDTO.setNome(resultset.getString("nome"));
				 
				 listaPessoas.add(pessoaDTO);
			 }
			 connection.close();
			 
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return listaPessoas;
	}
	
	public void update(PessoaDTO pessoaDTO) {
		try {
			
			Connection connection = ConexaoUtil.getInstance().getConecction();
			
			String sql = "UPDATE clientes SET nome = ? WHERE id = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, pessoaDTO.getNome());
			statement.setInt(2,  pessoaDTO.getId());
			
			
			statement.execute();
			System.out.println("ATUALIZADO COM SUCESSO!!!");
			statement.close();
			
			
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		PessoaDAO pessoaDAO = new PessoaDAO();
		
		List<PessoaDTO>  listaPessoas = new ArrayList<>();
		
		listaPessoas = pessoaDAO.listAll();
		
		for(int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i));
		}
	}

}

	
