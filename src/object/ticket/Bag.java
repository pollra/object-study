package object.ticket;

public class Bag {
    private Long amount;    // 현금
    private Invitation invitation;  // 초대장
    private Ticket ticket;  // 티켓

    public Bag(long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    // 초대장 보유 여부 판단
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 티켓 소유 여부 판단
    public boolean hasTicket() {
        return ticket != null;
    }

    // 초대장을 티켓으로 교환
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    // 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
