package Controle;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public PacienteDAO(){
        this.con = Conexao.conectar();
    }
    
    public int inserir(Paciente p) throws SQLException{
        try{
            String sql = "INSERT INTO PACIENTE(NOME, PESO, ALTURA) VALUES(?,?,?);";
            
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, p.getNome());
            cmd.setInt(2, p.getPeso());
            cmd.setInt(3, p.getAltura());
            
            if(cmd.executeUpdate() > 0){
                ResultSet rs = cmd.getGeneratedKeys();
            }
            else{
                return -1;
            }
            
        } catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            
        }
    
    }
}
