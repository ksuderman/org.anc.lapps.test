package org.anc.lapps.test;

import org.lappsgrid.api.Data;
import org.lappsgrid.api.DataSource;
import org.lappsgrid.core.DataFactory;
import org.lappsgrid.discriminator.Types;

/**
 * @author Keith Suderman
 */
public class TestDatasource implements DataSource
{
   public TestDatasource()
   {

   }

   @Override
   public Data query(Data data)
   {
      long type = data.getDiscriminator();
      if (type == Types.GET || type == Types.LIST) {
         return DataFactory.ok();
      }
      return DataFactory.error("Invalid query type.");
   }
}
