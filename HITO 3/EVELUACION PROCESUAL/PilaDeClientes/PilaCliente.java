package PilaDeClientes;

public class PilaCliente {
	
	private int max;
    private int tope;
    private Cliente[] cliente;

    public PilaCliente()
    {
        this.max = 10;
        this.tope = 0;
        this.cliente = new Cliente[this.max + 1];
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

    public void adicionar(Cliente newCliente)
    {
        if(esLlena())
        {
            System.out.println("La pila es Llena");
        }
        else
        {
            tope = tope + 1;
            cliente[tope] = newCliente;
        }
    }

    public Cliente eliminar()
    {
        Cliente deleteCliente = null;

        if(esVacio() == true)
        {
            System.out.println("La pila de clientes esta Vacia");
        }
        else
        {
            deleteCliente = cliente[this.tope];
            tope = tope -1;
        }
        return deleteCliente;
    }


    public void vaciar(PilaCliente pila)
    {
        while(!pila.esVacio())
            adicionar(pila.eliminar());
    }

    public void mostrar()
    {
        Cliente item = null;
        if(esVacio())
        {
            System.out.println("\n No hay item que Mostrar");
        }
        else
        {
            System.out.println("Mostrando la PILA DE CLIENTES");
            PilaCliente aux = new PilaCliente();
            while(!esVacio())
            {
                item = eliminar();
                item.muestraCliente();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
	

}
