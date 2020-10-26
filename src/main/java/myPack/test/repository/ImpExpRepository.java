package myPack.test.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import myPack.test.entity.ImpExp;

public interface ImpExpRepository extends CrudRepository<ImpExp, Integer> {
	/*
	 * @Query("SELECT i FROM ImpExp i WHERE i.barcode= :barcode AND i.date<= :date")
	 * List<ImpExp> findByBarcode(@Param("barcode") int barcode, @Param("date") Date
	 * date);
	 */
	
}
