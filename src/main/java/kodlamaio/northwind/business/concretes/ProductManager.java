package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	@Autowired
	private ProductDao productDao;
	// Product daoyu ornek yaratmak icin autowired yazılır

	//@Override
//	public List<Product> getAll() {
	// TODO Auto-generated method stub
	// return this.productDao.findAll();
	// }

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
				
				
			//	this.productDao.findAll();
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		// TODO Auto-generated method stub
		return new SuccessResult("Ürün eklendi");
	}

}
