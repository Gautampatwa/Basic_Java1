import java.util.ArrayList;

class Participant {
    private String name;
    private int speed;
    private int lengthCapacity;

    public Participant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLengthCapacity() {
        return lengthCapacity;
    }

    public void setLengthCapacity(int lengthCapacity) {
        this.lengthCapacity = lengthCapacity;
    }

    public Participant(String name, int speed, int lengthCapacity) {
        this.name = name;
        this.speed = speed;
        this.lengthCapacity = lengthCapacity;
    }

}

class Race {

    ArrayList<Participant> participants = new ArrayList<Participant>();
    int totalTracks;
    int trackLength;

    public Race(int totalTracks, int trackLength) {
        super();
        this.totalTracks = totalTracks;
        this.trackLength = trackLength;
    }


    public String addParticipants(Participant participant) {

        if (trackLength <= participant.getLengthCapacity() && totalTracks > participants.size()) {
            participants.add(participant);
            System.out.println("Start practicing");

        } else {
            System.out.println("Better Luck Next time");
        }
        return participant.getName();
    }

    public String getWinner(ArrayList<Participant> participants) {

        if (participants == null || participants.isEmpty()) {
            return null;
        }

        Participant winner = participants.get(0);

        for (int i = 1; i < participants.size(); i++) {
            Participant participant1 = participants.get(i);

            if (participant1.getSpeed() > winner.getSpeed()) {
                winner = participant1;
            }
        }
        return winner.getName();
    }

    public String getLooser(ArrayList<Participant> participants) {
        Participant looser = participants.get(0);
        for (int i = 1; i < participants.size(); i++) {
            Participant participant = participants.get(i);
            if (participant.getSpeed() < looser.getSpeed()) {
                looser = participant;
            }
        }
        return looser.getName();
    }

    public Race(ArrayList<Participant> participants, int totalTracks, int trackLength) {
        this.participants = participants;
        this.totalTracks = totalTracks;
        this.trackLength = trackLength;
    }

}

public class Source {

    public static void main(String[] args) {
        ArrayList<Participant> p=new ArrayList<>();
        p.add(new Participant("Test1",12,333));
        p.add(new Participant("Test2",14,400));
        p.add(new Participant("Test3",122,200));
        Race race = new Race(10, 200);
        race.addParticipants(p.get(1));
        System.out.println(race.getWinner(p));
        System.out.println(race.getLooser(p));
    }
}
