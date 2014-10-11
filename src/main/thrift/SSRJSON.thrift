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

include "ezbakeBaseTypes.thrift"

/**
 This object encapsulates all of the required information for the SSR pipeline to perform a free text index
 on incoming data. The SSR object is a search result that provides metadata and context for a client or
 end user that is searching for terms. The JSON string is a representation of the incoming document
 which is placed into the free text index as well as a view in the warehouse.
 */
struct SSRJSON
{
  /**
   The Standard Search Result object which contains metadata and faceting information about an indexed object.
   */
  1: required ezbakeBaseTypes.SSR ssr;

  /**
   A JSON representation of the incoming document. This is flexible and depends on what fields the end user may be
   interested in capturing in a free text search. This json string will also be placed into the warehouse under a
   view so that the end user can view the document in a readable form if necessary.
   */
  2: required string jsonString;
}
