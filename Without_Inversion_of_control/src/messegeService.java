public class messegeService {
    private emailService emailService;
    public messegeService(){
        this.emailService=new emailService(); //direct dependency.
    }

    void send(String message){
        emailService.sendEmail(message); //dependent
    }
}
