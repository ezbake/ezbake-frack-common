/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

namespace java ezbake.frack.common.utils.thrift

include "ProvenanceService.thrift"

/**
 * Provides information needed for adding, registering, a document with the
 * Provenance service.
 */
struct ProvenanceRegistration
{
   /**
    * The URI assigned to the document. The URI uniquely identifies the document
    * to which it is assigned.
    */
   1: required string uri
   
   /**
    * A collection of documents from which this document, identified by the URI,
    * was derived.
    */
   2: optional list<ProvenanceService.InheritanceInfo> parents
   
   /**
    * A collection of rules that determine when this document will be aged off.
    */
   3: optional list<ProvenanceService.AgeOffMapping> ageOffRules
}