package books.head_first_java.chapter_2.p73;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit drumKit = new DrumKit();
        drumKit.playShare();
        drumKit.snare = false;
        drumKit.playTopHat();

        if (drumKit.snare == true){
            drumKit.playShare();
        }
    }
}
