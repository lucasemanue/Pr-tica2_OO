public class Calculo {
  
    double invesInicial;
    double NumMeses;
    double taxaJuros;

    public Calculo(double invesInicial, double taxaJuros, double NumMeses){

      super();
      this.invesInicial = invesInicial;
      this.taxaJuros = taxaJuros;
      this.NumMeses = NumMeses;
      }

      public String rendimentoTotal(){
        double rendi = this.invesInicial * (this.taxaJuros * this.NumMeses);
        return "rendimento total: " + rendi;
      }

  }