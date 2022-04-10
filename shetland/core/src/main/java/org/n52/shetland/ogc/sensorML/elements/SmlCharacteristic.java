/*
 * Copyright 2015-2022 52°North Spatial Information Research GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.shetland.ogc.sensorML.elements;

import org.n52.shetland.ogc.swe.SweAbstractDataComponent;

public class SmlCharacteristic extends AbstractDataComponentContainer<SmlCharacteristic> {

    /**
     * default constructor
     */
    public SmlCharacteristic() {
        super();
    }

    /**
     * constructor
     *
     * @param name
     *            name
     */
    public SmlCharacteristic(String name) {
        super(name);
    }

    /**
     * constructor
     *
     * @param name
     *            name
     * @param abstractDataComponent
     *            data component
     */
    public SmlCharacteristic(String name, SweAbstractDataComponent abstractDataComponent) {
        super(name, abstractDataComponent);
    }

}
