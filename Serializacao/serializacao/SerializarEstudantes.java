import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<T> estudantes){
        try {
            FileOutputStream fout = new FileOutputStream("c:\\" + nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
            oos.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel serializar");;
        }
    }

    public List<T> desserializar(){
        List<T> lista = new ArrayList<>();
        try{
            FileInputStream fin = new FileInputStream("c:\\" + nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fin);
            lista = (List<T>) ois.readObject();
            ois.close();
        } catch (Exception e){
            System.out.println("Não foi possivel desserializar");
        }

        return lista;
    }
}
