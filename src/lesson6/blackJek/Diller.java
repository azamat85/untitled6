package lesson6.blackJek;

public class Diller extends Player {



    @Override
    public boolean needKartaHad() {
        int count = 0;
        for (int i = 0; i<super.kartas.length-1;i++)
        if(super.kartas[i]!=null){
            count+=super.kartas[i].getValue();
        }
        if (count<18)
        return true;
        else
        return false;
    }
}
