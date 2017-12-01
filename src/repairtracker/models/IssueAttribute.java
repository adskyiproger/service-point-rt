/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repairtracker.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author pigeon
 */
public class IssueAttribute {
    private static Logger LOGGER=LogManager.getLogger(IssueAttribute.class.getName()); 
    /*issueattribute_id bigint NOT NULL, issue_id bigint NOT NULL,"
                + " description varchar(128) NOT NULL, price double default null, issueattrtype_id bigint not null,
*/
    private Integer ID = -1;
    private Integer ISSUE_ID = -1;
    private Double COUNT_NUM=1.0;
    private Integer TYPE=-1;
    private String DESCRIPTION = "";
    private Double PRICE=0.0;
    private Connection DB = DBDoor.getConn();
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public IssueAttribute() {
        this(-1);
    }

    public IssueAttribute(Integer id) {
        this.ID = id;
        loadDB();

    }
    
   public static void  deleteById(Integer id){
       try {
       DBDoor.getConn().prepareStatement("delete from issueattributes where issueattribute_id="+String.valueOf(id)).execute();
       } catch (SQLException ex) {
           LOGGER.error(ex.getMessage(),ex);
       }
   }
   public static DefaultTableModel getAttributesAsTable(int id){
        String SQL = "select issueattribute_id, description, price, count_num, (price*count_num) as attr_total  from issueattributes where issue_id="+id;
        return getListFromDB(SQL);
   }
   public static DefaultTableModel getAttributesAsTable(int id, int type_id ){
        String SQL = "select issueattribute_id, description, price, count_num, (price*count_num) as attr_total from issueattributes where issue_id="+id+" and issueattrtype_id="+type_id;
        return getListFromDB(SQL);
    }
    
   private static DefaultTableModel getListFromDB(String sql) {
        Object[][] rowDATA = {};
        String[] colNames = {"#ID", java.util.ResourceBundle.getBundle("repairtracker/models/Bundle").getString("NAME"),java.util.ResourceBundle.getBundle("repairtracker/models/Bundle").getString("PRICE"),java.util.ResourceBundle.getBundle("repairtracker/models/Bundle").getString("COUNT"),java.util.ResourceBundle.getBundle("repairtracker/models/Bundle").getString("TOTAL")};
        DefaultTableModel _model = new DefaultTableModel(rowDATA, colNames);
        try {
        ResultSet resultSet = DBDoor.getStatement().executeQuery(sql);
            while (resultSet.next()) {
                    _model.addRow(new Object[]{resultSet.getInt("issueattribute_id"),resultSet.getString("description"),resultSet.getDouble("price"),resultSet.getDouble("count_num"),resultSet.getDouble("attr_total")});
                }
        } catch (SQLException ex) {
            LOGGER.error("IssueAttribute::getListFromDB(): "+ex.getMessage(),ex);
        }
       
       return _model;
    }
   
   public static Double getTotalCost(int issueId){
       Double total_cost=0.0;
       try {
       ResultSet rs = DBDoor.getStatement().executeQuery("select sum(price*count_num) as total_cost from issueattributes where issue_id="+issueId);
       rs.next();
       total_cost=rs.getDouble("total_cost");
       } catch (SQLException ex)
       {
           LOGGER.error("IssueAttribute::getListFromDB(): "+ex.getMessage(),ex);
       }
   return total_cost;
           
   }
   
   public static Double getTotalCost(int issueId, int issueAttrTypeId){
       Double total_cost=0.0;
       try {
       ResultSet rs = DBDoor.getStatement().executeQuery("select sum(price*count_num) as total_cost from issueattributes where issue_id="+issueId+" and issueattrtype_id="+issueAttrTypeId);
       rs.next();
       total_cost=rs.getDouble("total_cost");
       } catch (SQLException ex)
       {
           LOGGER.error("IssueAttribute::getListFromDB(): "+ex.getMessage(),ex);
       }
   return total_cost;
           
   }
   
   private void loadDB() {
        if (ID >-1) {
            try {
                resultSet = DBDoor.executeSelect("select * from issueattributes where issueattribute_id=" + this.ID);
                resultSet.next();
                ID = resultSet.getInt("issueattribute_id");
                DESCRIPTION = resultSet.getString("description");
                PRICE=resultSet.getDouble("price");
                COUNT_NUM=resultSet.getDouble("count_num");
                LOGGER.info("IssueAttribute::loadDB(): id=>"+ID+" description=>"+DESCRIPTION);
            } catch (SQLException ex) {
                LOGGER.error("IssueAttribute::loadDB(): " + ex.getMessage(),ex);
            }
        }
    }
    
    private void saveDB(String mode) {
        LOGGER.info("IssueAttribute::saveDB(): "+mode);
        try {
            if (mode.equals("I")) {
                preparedStatement = DB
                        .prepareStatement("insert into issueattributes values (?,?,?,?,?,?)");
                preparedStatement.setInt(1, this.ID);
                preparedStatement.setInt(2, this.ISSUE_ID);
                
                preparedStatement.setString(3, this.DESCRIPTION);
                preparedStatement.setDouble(4, this.PRICE);
                preparedStatement.setInt(5, this.TYPE);
                preparedStatement.setDouble(6, this.COUNT_NUM);
            }
            if (mode.equals("U")) {
                preparedStatement = DB
                        .prepareStatement("update issueattributes set "
                                + "description=? ,"
                                + "price=? ,"
                                + "count_num=? "
                                + "where issueattribute_id=?");
                preparedStatement.setString(1, this.DESCRIPTION);
                preparedStatement.setDouble(2,this.PRICE);
                preparedStatement.setDouble(3,this.COUNT_NUM);
                preparedStatement.setInt(4, this.ID);
            }
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            LOGGER.error("IssueAttribute::saveDB(): " + ex.getMessage());
        }
   }
   private void resolveID() {
        try {
            resultSet = DBDoor.getStatement()
                    .executeQuery("select max(issueattribute_id)+1 as issueattribute_id from issueattributes");
            resultSet.next();
            ID = resultSet.getInt("issueattribute_id");
        } catch (SQLException ex) {
            LOGGER.error("IssueAttribute::resolveID(): " + ex.toString());
        }
    }
    // Return methods
    public String name() {
        return DESCRIPTION;
    }

    public int id() {
        return ID;
    }
    
    public int typeId() {
        return ID;
    }
     public Double price() {
        return PRICE;
    }
     public Double count() {
        return COUNT_NUM;
    }
     
    
    // Set methods
    public void setName(String name) {
        this.DESCRIPTION = name;
    }
    public void setPrice(Double p) {
        this.PRICE = p;
    }
    public void setTypeId(int id) {
        this.TYPE = id;
    }
    
    public void setIssueId(int id) {
        this.ISSUE_ID = id;
    }
    public void setCount(Double cnt) {
        this.COUNT_NUM = cnt;
    }
    
    public void save() {
        LOGGER.info("Saving attribute to DB");
        if (this.ID >= 0) {
            this.saveDB("U");
            
        } else {
            this.resolveID();
            this.saveDB("I");
        }
    }
}
