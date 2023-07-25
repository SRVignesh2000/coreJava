package in.vigneshramachandran.srcatering.interfacee;

import java.time.LocalDate;
import java.util.List;

import in.vigneshramachandran.srcatering.model.Task;

public interface TaskInterface extends Base<Task> {

	public abstract int count();
	public abstract List<Task> findByDuedate(LocalDate date);

}
