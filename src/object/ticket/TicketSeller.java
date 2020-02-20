package object.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }

    // bb
    // gm-01
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(
                audience.buy(
                        ticketOffice.getTicket()
        ));
    }
}
