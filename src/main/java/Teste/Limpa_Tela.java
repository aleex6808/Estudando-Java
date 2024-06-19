/* não deu certo :((((( 
package Teste;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.InfoCmp.Capability;

import java.io.IOException;

class Limpa_Tela {
  public static void main(String[] args) throws IOException {
    Terminal terminal = TerminalBuilder.terminal();
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
      cls(terminal);
    }
  }

  public static void cls(Terminal terminal) throws IOException {
    terminal.puts(Capability.clear_screen);
    terminal.flush();
  }
}
*/