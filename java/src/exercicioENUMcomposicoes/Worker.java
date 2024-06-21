package exercicioENUMcomposicoes;
import java.util.*;


import exercicioENUMcomposicoes.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalarial;
	private Departament departament;
	
	private List<HourContract> contracts = new ArrayList<>();
	
	
	public Worker() {
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalarial, Departament departament) {
		
		this.name = name;
		this.level = level;
		this.baseSalarial = baseSalarial;
		this.departament = departament;
	}
	
	public String toString() {
        return this.name +" "+ this.level +" "+ this.baseSalarial +" " ;
    }
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBaseSalarial() {
		return baseSalarial;
	}


	public void setBaseSalarial(int baseSalarial) {
		this.baseSalarial = baseSalarial;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}


	public List<HourContract> getContract() {
		return contracts;
	}


	public void setContract(List<HourContract> contract) {
		this.contracts = contract;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
		
	} 
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
		
	} 
	
	public double income(int year, int month) {
		double sum = baseSalarial;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}