package br.com.cod3r.chain.billsDispenser;

public class Bill {

    private Integer value;
    private Bill next;

    public Bill(Integer value) {
        this.value = value;
    }

    public Bill(Integer value, Bill next) {
        this.value = value;
        this.next = next;
    }

    public void setNext(Bill bill) {
        this.next = bill;
    }

    public void execute(Integer remaining) {
        if (remaining >= value) {
            int bills = remaining / value;
            remaining %= value;
            System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, value, remaining);
        }
        if (remaining == 0) return;
        if (next != null) next.execute(remaining);
    }
}
