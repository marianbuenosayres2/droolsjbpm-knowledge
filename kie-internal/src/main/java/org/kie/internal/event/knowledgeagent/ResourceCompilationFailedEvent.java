/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.internal.event.knowledgeagent;

import java.util.EventObject;

import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;

public class ResourceCompilationFailedEvent extends EventObject{

    private static final long serialVersionUID = 510l;

    private final Resource resource;
    private final ResourceType resourceType;

    public ResourceCompilationFailedEvent(KnowledgeBuilder kbuilder, Resource resource, ResourceType resourceType) {
        super(kbuilder);
        this.resource = resource;
        this.resourceType = resourceType;
    }

    public Resource getResource() {
        return resource;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public KnowledgeBuilder getKnowledgeBuilder() {
        return (KnowledgeBuilder)this.getSource();
    }

    @Override
    public String toString() {
        return "==>[ResourceCompilationFailedEvent: " + getKnowledgeBuilder() + "]";
    }

}
