package Engine;

	public class Engine {
		private int Power = 1350;
		private int Production;

		public Engine() {
		}

		public int getPower() {
			if (this.Power > 20000) {
				System.out.println("ecological engine");
				return this.Power;
			} else {
				System.out.println("not ecological engine");
				return this.Power;
			}
		}

		public void setPower(int power) {
			this.Power = power;
		}

		public int getProduction() {
			if (this.Production > 2000) {
				System.out.println("proper production");
				return this.Production;
			} else {
				System.out.println("not proper");
				return this.Production;
			}
		}

		public void setProduction(int production) {
			this.Production = production;
		}
	}




}
