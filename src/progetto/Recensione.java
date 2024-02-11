package progetto;

public class Recensione {

        private Cliente cliente;
        private String testo;
        private VotoEnum voto;

        private boolean posted;

        public Recensione(Cliente cliente, String testo, VotoEnum voto) {
            this.cliente = cliente;
            this.testo = testo;
            this.voto = voto;
            this.posted = false;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public String getTesto() {
            return testo;
        }

        public VotoEnum getVoto() {
            return voto;
        }

        public boolean isPosted() {
            return posted;
        }

        public void setPosted(boolean posted) {
            this.posted = posted;
        }


        public void stampaRecensione(){
            System.out.println(MessaggiEnum.RECENSIONE.getMessaggio() + CaratteriSpeEnum.DUEPUNTI.getCarattere() +
                    CaratteriSpeEnum.SPAZIO.getCarattere() + cliente + CaratteriSpeEnum.SPAZIO.getCarattere() +
                    CaratteriSpeEnum.TRATTINO.getCarattere() + CaratteriSpeEnum.SPAZIO.getCarattere() + testo +
                    CaratteriSpeEnum.SPAZIO.getCarattere() + CaratteriSpeEnum.TRATTINO.getCarattere() +  CaratteriSpeEnum.SPAZIO.getCarattere() + voto);
        }
}


