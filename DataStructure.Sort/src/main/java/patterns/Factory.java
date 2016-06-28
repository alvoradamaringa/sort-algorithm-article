package patterns;

public interface Factory {
	int[] structure(int[] value);

	double getStart();

	double getEndTime();

	String [] getDifferenceTime(double endTime, double start);

	int[] toReader(String path);
}
