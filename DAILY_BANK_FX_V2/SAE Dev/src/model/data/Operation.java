package model.data;

import java.sql.Date;

public class Operation {

	public int idOperation;
	public double montant;
	public Date dateOp;
	public Date dateValeur;
	public int idNumCompte;
	public String idTypeOp;

	public Operation(int idOperation, double montant, Date dateOp, Date dateValeur, int idNumCompte, String idTypeOp) {
		super();
		this.idOperation = idOperation;
		this.montant = montant;
		this.dateOp = dateOp;
		this.dateValeur = dateValeur;
		this.idNumCompte = idNumCompte;
		this.idTypeOp = idTypeOp;
	}

	public Operation(Operation o) {
		this(o.idOperation, o.montant, o.dateOp, o.dateValeur, o.idNumCompte, o.idTypeOp);
	}

	public Operation() {
		this(-1000, 0, null, null, -1000, null);
	}

	@Override
	public String toString() {
		return this.dateOp + " : " + String.format("%25s", this.idTypeOp) + " "
				+ String.format("%10.02f", this.montant);

	}
}
