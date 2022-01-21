public class Employee {

    String name;
    float salary;
    int workHours;
    int hireYear;
    float vergi=0;
    int ödül=0;
    float zam=0;

    public Employee(String name, float salary, int workHours, int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public void tax(){

        if(this.salary>=1000)
            this.vergi=this.salary*3/100;

    }

    public void bonus(){

        if (this.workHours>40)
            this.ödül=30*(this.workHours-40);

    }

    public void raiseSalary(){

        float newSalary;
        if((2021-this.hireYear)>0 && (2021-this.hireYear)<=10)
            this.zam=this.salary*5/100;
        else if ((2021-this.hireYear)>10 && (2021-this.hireYear)<=20)
            this.zam=this.salary*10/100;
        else if ((2021-this.hireYear>20))
            this.zam=this.salary*15/100;

    }

    public void printEmployee(){

        System.out.println("Çalışan: "+this.name);
        System.out.println("Maaş= "+this.salary);
        System.out.println("Haftalık Çalışma Saati= "+this.workHours);
        System.out.println("Başlangıç Yılı= "+this.hireYear);
        System.out.println(this.name+" çalışanı bu ay "+this.vergi+"TL vergi ödeyecek.");
        System.out.println(this.name+" çalışanı bu hafta "+this.ödül+"TL ödül kazandı.");
        System.out.println("Zam= "+this.zam);
        System.out.println("Vergiler ve bonuslar ile birlikte maaş= "+(this.salary+this.zam+this.ödül-this.vergi));

    }

}
