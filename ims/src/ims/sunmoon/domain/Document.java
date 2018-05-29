package ims.sunmoon.domain;

import java.io.Serializable;

// 보고서
public class Document implements Serializable {
	private static final long serialVersionUID = 4556952043434365240L;

	private Account account;
	private Bereleased be;
	private Client client;
	private Deposit dep;
	private Item item;
	private Manager manager;
	private Warehousing ware;
	private Withdraw with;

	private BD bd;
	private WW ww;

	public Document() {
	}

	public Document(Account account, Bereleased be, Client client, Deposit dep, Item item, Manager manager,
			Warehousing ware, Withdraw with, BD bd, WW ww) {
		this.account = account;
		this.be = be;
		this.client = client;
		this.dep = dep;
		this.item = item;
		this.manager = manager;
		this.ware = ware;
		this.with = with;
		this.bd = bd;
		this.ww = ww;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Bereleased getBe() {
		return be;
	}

	public void setBe(Bereleased be) {
		this.be = be;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Deposit getDep() {
		return dep;
	}

	public void setDep(Deposit dep) {
		this.dep = dep;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Warehousing getWare() {
		return ware;
	}

	public void setWare(Warehousing ware) {
		this.ware = ware;
	}

	public Withdraw getWith() {
		return with;
	}

	public void setWith(Withdraw with) {
		this.with = with;
	}

	public BD getBd() {
		return bd;
	}

	public void setBd(BD bd) {
		this.bd = bd;
	}

	public WW getWw() {
		return ww;
	}

	public void setWw(WW ww) {
		this.ww = ww;
	}
}
