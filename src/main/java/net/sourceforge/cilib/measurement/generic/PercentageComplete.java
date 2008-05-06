/*
 * Copyright (C) 2003 - 2008
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.measurement.generic;

import net.sourceforge.cilib.algorithm.Algorithm;
import net.sourceforge.cilib.measurement.Measurement;
import net.sourceforge.cilib.type.types.Real;
import net.sourceforge.cilib.type.types.Type;

/**
 *
 * @author  Edwin Peer
 */
public class PercentageComplete implements Measurement {
	private static final long serialVersionUID = 552272710698138639L;

	/** Creates a new instance of PercentageComplete. */
    public PercentageComplete() {
    }
    
    public PercentageComplete(PercentageComplete copy) {
    }
    
    public PercentageComplete getClone() {
    	return new PercentageComplete(this);
    }
    
    public String getDomain() {
    	return "R(0,1)";
    	//return "T";
    }
    
    public Type getValue() {
        //return new Double(Algorithm.get().getPercentageComplete());
    	
    	Double d = new Double(Algorithm.get().getPercentageComplete());
    	
    	return new Real(d.doubleValue());
    }
    
}
