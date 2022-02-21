package com.softserve.edu.project;

import java.util.*;

public class Flat {

    private int area, ex_time;
    private double gas, water, energy,gas_per_res,water_per_res,energy_per_res;
    private double res_per_metre = 0.1;
    private double gas_per_metre = 10;
    private double water_per_metre = 5;
    private double energy_per_metre = 15;

    public Flat(int area, int num_res, int ex_time, double gas, double water, double energy, double res_per_metre, double gas_per_metre, double water_per_metre, double energy_per_metre) {
        this.area = area;
        this.num_res = num_res;
        this.ex_time = ex_time;
        this.gas = gas;
        this.water = water;
        this.energy = energy;
        this.res_per_metre = res_per_metre;
        this.gas_per_metre = gas_per_metre;
        this.water_per_metre = water_per_metre;
        this.energy_per_metre = energy_per_metre;
    }

    Scanner scanner = new Scanner(System.in);

    public void Stats() {
        System.out.println("Введіть кількість спожитого газу (в кубах): ");
        gas = scanner.nextDouble();
        System.out.println("Введіть кількість спожитої електроенергії (в кіловат/год): ");
        energy = scanner.nextDouble();
        System.out.println("Введіть кількість спожитої води (в кубах): ");
        water = scanner.nextDouble();
        if (gas < 0 || energy < 0 || water < 0) {
            System.out.println("Неправильні показники! Введіть ще раз: ");
            Stats();
        }
        System.out.println("-----------------------------------------------------");
    }

    public void Prices() {
        double Energy = energy * 1.4;
        double Water = water * 14.74;
        double Gas = gas * 6.8;
        System.out.println("Вартість спожитої електроенергії становить " + Energy + " грн.");
        System.out.println("Вартість спожитої води становить " + Water + " грн.");
        System.out.println("Вартість спожитого газу становить " + Gas + " грн.");
    }

    List<String> Names = new ArrayList<>();
    int num_res = Names.size();
    public void addRes() {
        if (area * res_per_metre >= num_res + 1) {
            String NewName;
            System.out.println("Введіть ім'я: ");
            NewName = scanner.nextLine();
            Names.add(NewName);
            num_res = Names.size();
        } else
            System.out.println("Площа заповнена!");
        System.out.println("-----------------------------------------------------");
    }

    public void getNames() {
        if (!Names.isEmpty()) {
            for (int i = 0; i < Names.size(); i++) {
                System.out.println(Names.get(i));
            }
        }else
            System.out.println("Немає");
    }
    public void get_props(){
        System.out.println("Площа становить - " + area + " метрів кв.");
        System.out.println("Кількість мешканців - " + num_res + ".");
        System.out.print("Імена мешканців: ");
        getNames();
        System.out.println("Термін експлуатації - " + ex_time + " днів.");
        System.out.println("Кількість вжитої енергії - " + energy + " кіловат на годину.");
        System.out.println("Кількість вжитої води - " + water + " кубів.");
        System.out.println("Кількість вжитого газу - " + gas + " кубів.");
        System.out.println("Щоб ввести показники - 1");
        System.out.println("Щоб розрахувати ціну - 2");
        System.out.println("Щоб додати жителя - 3");
        System.out.println("Щоб відняти жителя - 4");
        System.out.println("Щоб додати кількість днів та порахувати кількість спожитих ресурсів згідно кількості мешкінців -5");

    }
    public void live(int days){
        ex_time += days;
        gas += gas_per_res * days * this.num_res;
        water += water_per_res * days * this.num_res;
        energy += energy_per_res * days * this.num_res;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNum_res() {
        return num_res;
    }

    public void setNum_res(int num_res) {
        this.num_res = num_res;
    }

    public int getEx_time() {
        return ex_time;
    }

    public void setEx_time(int ex_time) {
        this.ex_time = ex_time;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getGas_per_res() {
        return gas_per_res;
    }

    public void setGas_per_res(double gas_per_res) {
        this.gas_per_res = gas_per_res;
    }

    public double getWater_per_res() {
        return water_per_res;
    }

    public void setWater_per_res(double water_per_res) {
        this.water_per_res = water_per_res;
    }

    public double getEnergy_per_res() {
        return energy_per_res;
    }

    public void setEnergy_per_res(double energy_per_res) {
        this.energy_per_res = energy_per_res;
    }
}

