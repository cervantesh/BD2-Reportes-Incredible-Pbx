/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Cdr;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author cervanteshernandez
 */
public class CdrManager {
    private Session session;
    public static Long contador;
    
    public List<Cdr> query(String hql)
    {
        contador = (long) 0;
        List Cdrs = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            //displayResult(resultList);
            Cdrs = resultList;
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return Cdrs;
    }
    
    public List<Cdr> queryLimit(String hql,int l,int r)
    {
        contador = (long) 0;
        List Cdrs = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            q.setFirstResult(l);
            q.setMaxResults(r);
            List resultList = q.list();            
            Cdrs = resultList;
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery("select count(a.uniqueid) " + hql);
            q.setFirstResult(l);
            q.setMaxResults(r);
            contador = (Long) q.uniqueResult();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return Cdrs;
    }

    public List<Cdr> getAll()
    {
        String hql = "from Cdr";
        return query(hql);
    }
    
    public  List<Cdr> MostCallsMissedQuery()

    {        
        String hql = " from Cdr a where a.disposition = 'NO ANSWER' or a.disposition "
                + "='BUSY'  group by a.dst order by count(a.uniqueid) desc";
        
        return queryLimit(hql,0,1);
    }
    
    public  List<Cdr> MostCallsMadeQuery()
    {
        
        String hql = "from Cdr a  "
                + "group by a.src order by count(a.uniqueid) desc";
        return queryLimit(hql,0,1);
    }
    
    public  List<Cdr>  MostCallsRecievedQuery()
    {
        String hql =   "from Cdr a "
                + "where a.disposition = 'ANSWERED' "
                + "group by a.dst order by count(a.uniqueid) desc";
         
        return queryLimit(hql,0,1);
    }
    
    

    public CdrManager() {
        
    }
    
    
    
    
    /*
    public List<Cdr> getLeastAnwsered()
    {
        List Cdrs = null;
        //hql = "select a.dst, count(a.uniqueid) from Cdr a where a.disposition = 'NO ANSWER' or a.disposition ='BUSY'  group by a.dst order by count(a.uniqueid) desc";
      
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Criteria crit = session.createCriteria(Cdr.class); 
            ProjectionList proList = Projections.projectionList();
            
            proList.add(Projections.property("dst"))
                   .add(Projections.property("uniqueid"))
                   .add(Projections.groupProperty("dst"))
                   .add(Projections.rowCount(),"cantidad");
            
            crit.add
            (
                Restrictions.or
                (
                    Restrictions.eq("disposition", "NO ANSWER"),
                    Restrictions.eq("disposition", "BUSY")    
                )
            )
            .setMaxResults(1)
            .setProjection(proList);
            List resultList = crit.list();
            //displayResult(resultList);
            Cdrs = resultList;
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return Cdrs;
    }*/
        
        
    
}
