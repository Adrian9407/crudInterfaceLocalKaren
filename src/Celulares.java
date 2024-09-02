import java.time.LocalDate;

public class Celulares {
        private long imei;
        private String marca;
        private String modelo;
        private float precio;
        private LocalDate fechaLanz;
        
        
		public Celulares() {
		}


		public Celulares(long imei, String marca, String modelo, float precio, LocalDate fechaLanz) {
			this.imei = imei;
			this.marca = marca;
			this.modelo = modelo;
			this.precio = precio;
			this.fechaLanz = fechaLanz;
		}


		@Override
		public String toString() {
			return "Celulares [imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
					+ ", fechaLanz=" + fechaLanz + "]\n";
		}


		public long getImei() {
			return imei;
		}


		public void setImei(long imei) {
			this.imei = imei;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public float getPrecio() {
			return precio;
		}


		public void setPrecio(float precio) {
			this.precio = precio;
		}


		public LocalDate getFechaLanz() {
			return fechaLanz;
		}


		public void setFechaLanz(LocalDate fechaLanz) {
			this.fechaLanz = fechaLanz;
		}
        
        
}
