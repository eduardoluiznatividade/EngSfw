package model.vo;

public enum TipoPrioridade {
	ALTA {
		@Override
		public int obtemSLA() {
			return 12;
		}
	}, MEDIA {
		@Override
		public int obtemSLA() {
			return 24;
		}
	}, BAIXA {
		@Override
		public int obtemSLA() {
			return 36;
		}
	};
	
	public abstract int obtemSLA();
	
}
