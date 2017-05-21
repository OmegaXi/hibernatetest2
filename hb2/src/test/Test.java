package test;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.model.Buy;
import org.util.HibernateSessionFactory;

public class Test {
	   public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		System.out.println("以下是所有商品：");
		Query query1=session.createQuery("from Buy");
		List list1=query1.list();
		for(int i=0;i<list1.size();i++){
			Buy b=(Buy)list1.get(i);
			System.out.println(b.getName());
		}
		System.out.println("以下是价值大于100的所有商品：");
		Query query2=session.createQuery("from Buy where price>100");
		List list2=query2.list();
		for(int i=0;i<list2.size();i++){
			Buy b=(Buy)list2.get(i);
			System.out.println(b.getName());
		}
		HibernateSessionFactory.closeSession(); // 关闭Session
	   }
	}
