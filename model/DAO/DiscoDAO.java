package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Disco;

public class DiscoDAO {
    Connection con;
    public void inserirDisco(Disco d)throws SQLException{
        con = new Conexao().getConnection();
        String sql = "insert into Discos (titulo,artista,anoLancamento,gravadora,numTracks) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, d.getTitulo());
        stmt.setString(2, d.getArtista());
        stmt.setInt(3, d.getAnoLancamento());
        stmt.setString(4, d.getGravadora());
        stmt.setInt(5, d.getQtdTracks());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void excluirDisco(int codigo) throws SQLException{
        con  = new Conexao().getConnection();
        String sql = "delete from Discos where codigo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, codigo);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Disco> buscarDiscos() throws SQLException{
        ResultSet rs;
        ArrayList<Disco> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "select * from Discos";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            String titulo = rs.getString("titulo");
            String artista = rs.getString("artista");
            int anoLancamento = rs.getInt("anoLancamento");
            String gravadora = rs.getString("gravadora");
            int qtdTracks = rs.getInt("numTracks");
            Disco d = new Disco(titulo, artista, anoLancamento, gravadora, qtdTracks);
            d.setId(codigo);
            lista.add(d);
        }
        stmt.close();
        con.close();
        return lista;
    }
    
    public ArrayList<Disco> buscarDiscos(String tituloDisco) throws SQLException{
        ResultSet rs;
        ArrayList<Disco> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "select * from Discos where titulo like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, tituloDisco + "%");
        rs = stmt.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            String titulo = rs.getString("titulo");
            String artista = rs.getString("artista");
            int anoLancamento = rs.getInt("anoLancamento");
            String gravadora = rs.getString("gravadora");
            int qtdTracks = rs.getInt("numTracks");
            Disco d = new Disco(titulo, artista, anoLancamento, gravadora, qtdTracks);
            d.setId(codigo);
            lista.add(d);
        }
        stmt.close();
        con.close();
        return lista;
    }
}
