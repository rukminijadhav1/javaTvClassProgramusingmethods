package programs.Taskforpractice;

import java.util.Scanner;

public class TVclass {
	private String brand;
	private int size;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
    public TVclass(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    public TVclass() {
		}
    public void printTv() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of TVs:");
        int numTvs = scan.nextInt();
        
        TVclass[] tvs = new TVclass[numTvs];
        
        for (int i = 0; i < numTvs; i++) {
            System.out.println("Enter TV brand:");
            String brand = scan.next();
            System.out.println("Enter TV size in inches:");
            int size = scan.nextInt();
            System.out.println("Enter TV price:");
            double price = scan.nextDouble();
            
            TVclass tv = new TVclass(brand, size, price);
           
            tvs[i] = tv;
        }
       
        for (TVclass tv : tvs) {
      	tv.printInfo();
      }
    }

    public double calculateDiscount() {
        double discount = 0.0;
        if (size > 50) {
            discount = 0.1 * price;
        } else if (size > 40) {
            discount = 0.05 * price;
        }
        return discount;
    }
    public void printInfo() {
        double discountedPrice = price - calculateDiscount();
        System.out.printf("Brand: %s, Size: %d inches, Discounted Price: rs%.2f\n", brand, size, discountedPrice);
    }

}
