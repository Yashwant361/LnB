package Learn_and_Build;

public class voter {
    public static void main(String[] args) {

    Vote voter = new Vote();
voter.setName("Yash");
        voter.setAge(23);
        if (voter.isEligibleToVote()) {
        System.out.println(voter.getName() + " is eligible to vote.");
        } else {
        System.out.println(voter.getName() + " is not eligible to vote.");
        }
    }
}
