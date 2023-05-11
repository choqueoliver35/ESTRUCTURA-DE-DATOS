package defensa_pilas_hito3;


public class PilaEstudiante {
	
	private int max;
    private int tope;
    private Estudiante[] Estudiante;

    public PilaEstudiante()
    {
        this.max = 10;
        this.tope = 0;
        this.Estudiante = new Estudiante[this.max + 1];
    }

    public boolean esVacio()
    {
        if(this.tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esLlena()
    {
        if(this.tope == this.max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int nroElem()
    {
        return this.tope;
    }

    public void adicionar(Estudiante newCliente)
    {
        if(esLlena())
        {
            System.out.println("La pila es Llena");
        }
        else
        {
            tope = tope + 1;
            Estudiante[tope] = newCliente;
        }
    }

    public Estudiante eliminar()
    {
    	Estudiante deleteCliente = null;

        if(esVacio() == true)
        {
            System.out.println("La pila de clientes esta Vacia");
        }
        else
        {
            deleteCliente = Estudiante[this.tope];
            tope = tope -1;
        }
        return deleteCliente;
    }


    public void vaciar(PilaEstudiante pila)
    {
        while(!pila.esVacio())
            adicionar(pila.eliminar());
    }

    public void mostrar()
    {
        Estudiante item = null;
        if(esVacio())
        {
            System.out.println("\n No hay item que Mostrar");
        }
        else
        {
            System.out.println("Mostrando la PILA DE ESTUDIANTES");
            PilaEstudiante aux = new PilaEstudiante();
            while(!esVacio())
            {
                item = eliminar();
                item.muestraEstudiante();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }

}
