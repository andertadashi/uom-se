/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright (c) 2005-2014, Jean-Marie Dautelle, Werner Keil, V2COM.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-363 nor the names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tec.uom.se.quantity;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import javax.measure.Quantity;
import javax.measure.spi.QuantityFactory;

/**
 * Provider of Quantities
 * @author otaviojava
 * @author werner
 * @version 0.2
 */
@SuppressWarnings("rawtypes")
public final class QuantityFactoryProvider {
// TODO could help SPI, but it competes with Quantities
    private QuantityFactoryProvider() {}

    private static final Map<Class, QuantityFactory> INSTANCE = new ConcurrentHashMap<>();

    /**
     * return a factory Quantities from this unit
     * @param unit the unit
     * @return the Quantities
     * @throws NullPointerException
     */
    @SuppressWarnings("unchecked")
    public static final <Q extends Quantity<Q>>  QuantityFactory<Q> getQuantityFactory(Class<Q> unit){
        Objects.requireNonNull(unit);
        if(!INSTANCE.containsKey(unit)) {
            synchronized (INSTANCE) {
                INSTANCE.put(unit, new DefaultQuantityFactory<>(unit));
            }
        }
        return INSTANCE.get(unit);
    }
}
