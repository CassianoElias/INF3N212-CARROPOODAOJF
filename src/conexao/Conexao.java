/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 201401665
 */
/*public class Conexao {
  private static String host = "jdbc:mysql://localhost:3306/carro";  
  private static String user = "root";
  private static String pass = "";
  */
  
  public class Conexao {
  private static String host = "jdbc:mysql://https://db4free.net:3306/carroscassiano";  
  private static String user = "cassianoelias";
  private static String pass = "15821582";
  
  public static Connection getConexao() throws SQLException{
      Connection c = null;
      try {
          c = DriverManager.getConnection(host, user, pass);
      } catch (SQLException e) {
       throw new SQLException("Erro ao conectar!\n" + e.getMessage());
      }
      return c;
  }
}
