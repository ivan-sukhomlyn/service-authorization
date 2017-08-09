/*
 * Copyright 2017 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-dao
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.epam.reportportal.auth.store.entity;

import com.epam.reportportal.auth.validation.EnabledAuthSequenceProvider;
import com.epam.reportportal.auth.validation.IfEnabled;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.validation.constraints.AssertTrue;

/**
 * @author Andrei Varabyeu
 */
@GroupSequenceProvider(EnabledAuthSequenceProvider.class)
public class AbstractAuthConfig {

//    @AssertTrue(
//            message = "Enabled LDAP validtion constraints",
//            groups = { IfEnabled.class }
//    )
    private Boolean enabled;

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}