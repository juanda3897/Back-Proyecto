package com.univers.model;

public class Item {
	
		private int num;
		private Bloque bloq;
		public Item(int num, Bloque bloq) {
			super();
			this.num = num;
			this.bloq = bloq;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public Bloque getBloq() {
			return bloq;
		}
		public void setBloq(Bloque bloq) {
			this.bloq = bloq;
		}
		
}
