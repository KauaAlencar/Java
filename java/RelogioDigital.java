public class RelogioDigital {
    private int hora;
    private int minuto;
    private int segundo;

    
    public RelogioDigital() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    
    public RelogioDigital(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        }
    }

    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    
    public void tick() {
        segundo++;
        if (segundo > 59) {
            segundo = 0;
            minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
                if (hora > 23) {
                    hora = 0;
                }
            }
        }
    }

    
    public String getHorario() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    
    public static void main(String[] args) throws InterruptedException {
        RelogioDigital relogio = new RelogioDigital(23, 59, 59);

        for (int i = 0; i < 5; i++) { // coloquei para mostrar 5 avanços dos ticks 
            relogio.tick();
            System.out.println(relogio.getHorario());
            Thread.sleep(100);
        }
    }
}
