package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.DiscoDAO;
import model.Disco;

public class DiscoController {
    public void inserirAluno(String titulo, String artista, int anoLancamento, String gravadora, int qtdTracks) throws SQLException{
        Disco d = new Disco(titulo, artista, anoLancamento, gravadora, qtdTracks);
        DiscoDAO dDAO = new DiscoDAO();
        dDAO.inserirDisco(d);
    }
    
    public void excluirDisco(int codigo) throws SQLException{
        DiscoDAO dDAO = new DiscoDAO();
        dDAO.excluirDisco(codigo);
    }
    public ArrayList<Disco> buscarDiscos() throws SQLException{
        DiscoDAO dDAO = new DiscoDAO();
        return (dDAO.buscarDiscos());
    }
    public ArrayList<Disco> buscarDiscos(String titulo) throws SQLException{
        DiscoDAO dDAO = new DiscoDAO();
        return (dDAO.buscarDiscos(titulo));
    }
}
