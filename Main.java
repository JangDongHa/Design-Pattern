import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String drive = null;
        double totalSize, freeSize, useSize;
        File[] roots = File.listRoots();

        for (File root : roots) {
            drive = root.getAbsolutePath();
            totalSize = root.getTotalSpace() / Math.pow(1024, 3);
            useSize = root.getUsableSpace() / Math.pow(1024, 3);
            freeSize = totalSize - useSize;

            System.out.println("드라이브 정보 : " + drive + "\n");
            System.out.println("전체 용량 : " + totalSize + " GB \n");
            System.out.println("사용 용량 : " + freeSize + " GB \n");
            System.out.println("남은 용량 : " + useSize + " GB \n");
        }
        String filename = "test.txt";
        File file = new File(drive + filename);
        try {
            file.createNewFile();
            System.out.println("Created in " + drive + " filename is " + filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
