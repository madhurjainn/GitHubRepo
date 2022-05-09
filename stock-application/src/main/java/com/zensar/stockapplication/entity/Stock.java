package com.zensar.stockapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel("This is a stock model")
@Entity(name = "MyStock")
@Table(name = "Stock")

//@NamedQueries(value = {@NamedQuery(name = "Stock.findStockByItsName",query = "FROM MyStock s where s.name=?1"),
//@NamedQuery(name="Stock.findStockByItsNameAndPrice",query="FROM MyStock s where s.name=?1 and s.price=?2")})

//@NamedQuery(name = "Stock.findStockByItsName",query = "FROM Stock s where s.name=?1")
//@NamedQuery(name="Stock.findStockByItsNameAndPrice",query="FROM Stock s where s.name=?1 and s.price=?2")
//@NamedNativeQuery(name = "Stock.findStockByItsName",query ="select * from stock where name=?1",resultClass = Stock.class)
public class Stock {
	//@ApiModelProperty("StockId of integer type ")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	//@Column(name = "id")
	private int stockId;
	private String name;
	private String marketName;
	private double price;

}
