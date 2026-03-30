import java.util.Stack;

public class Pila {
    private Stack<Publicacion> obj;

    public Pila(){
        obj=new Stack<>();
    }

    public void push(Publicacion dato){
        obj.push(dato);
    }

    public Publicacion pop() throws Exception{
        if(obj.isEmpty())
            throw new Exception("NO EXISTE ELEMENTOS EN LA PILA");
        return obj.pop();
    }

    public Publicacion peek() throws Exception{
        if(obj.isEmpty())
            throw new Exception("NO EXISTE ELEMENTOS EN LA PILA");
        return obj.peek();
    }

    public String listarTodos(){
        String resultado="";

        for (int i=obj.size()-1; i>=0;i--){
            resultado+=obj.get(i).toString();
        }
        return resultado.length()!=0?resultado:"NO HAY ELEMENTOS";
    }


}
