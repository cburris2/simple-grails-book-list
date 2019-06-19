package helloworld

class BootStrap {

	def init = { servletContext ->

		new Book(name: 'Grails for others', author: 'AJ Goobie').save()
		new Book(name: 'Pursuit of God', author: 'AW Tozer').save()
		new Book(name: 'Grails for noobs', author: 'Mac Daddy').save()
		new CollectionRecord(uuid:"1f3er-rd352",
		configurations:"some json",
		iso_xml: """<?xml version="1.0" encoding="UTF-8"?>

<gmi:MI_Metadata xmlns:gco="http://www.isotc211.org/2005/gco" xmlns:gmd="http://www.isotc211.org/2005/gmd" xmlns:gmi="http://www.isotc211.org/2005/gmi" xmlns:gml="http://www.opengis.net/gml/3.2" xmlns:gmx="http://www.isotc211.org/2005/gmx" xmlns:gsr="http://www.isotc211.org/2005/gsr" xmlns:gss="http://www.isotc211.org/2005/gss" xmlns:gts="http://www.isotc211.org/2005/gts" xmlns:srv="http://www.isotc211.org/2005/srv" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.isotc211.org/2005/gmi https://data.noaa.gov/resources/iso19139/schema.xsd">
  <gmd:fileIdentifier>
    <gco:CharacterString>gov.noaa.nodc:0164586</gco:CharacterString>
  </gmd:fileIdentifier>
  <gmd:language>
    <gmd:LanguageCode codeList="http://www.loc.gov/standards/iso639-2/php/code_list.php" codeListValue="eng">eng</gmd:LanguageCode>
  </gmd:language>
  <gmd:characterSet>
    <gmd:MD_CharacterSetCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#MD_CharacterSetCode" codeListValue="utf8">utf8</gmd:MD_CharacterSetCode>
  </gmd:characterSet>
  <gmd:hierarchyLevel>
    <gmd:MD_ScopeCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#MD_ScopeCode" codeListValue="dataset">dataset</gmd:MD_ScopeCode>
  </gmd:hierarchyLevel>
  <gmd:contact>
    <gmd:CI_ResponsibleParty>
      <gmd:organisationName>
        <gco:CharacterString>DOC/NOAA/NESDIS/NCEI &gt; National Centers for Environmental Information, NESDIS, NOAA, U.S. Department of Commerce</gco:CharacterString>
      </gmd:organisationName>
      <gmd:positionName>
        <gco:CharacterString>Data Officer</gco:CharacterString>
      </gmd:positionName>
      <gmd:contactInfo>
        <gmd:CI_Contact>
          <gmd:phone>
            <gmd:CI_Telephone>
              <gmd:voice>
                <gco:CharacterString>301-713-3277</gco:CharacterString>
              </gmd:voice>
              <gmd:facsimile>
                <gco:CharacterString>301-713-3300</gco:CharacterString>
              </gmd:facsimile>
            </gmd:CI_Telephone>
          </gmd:phone>
          <gmd:address>
            <gmd:CI_Address>
              <gmd:deliveryPoint>
                <gco:CharacterString>Federal Building 151 Patton Avenue</gco:CharacterString>
              </gmd:deliveryPoint>
              <gmd:city>
                <gco:CharacterString>Asheville</gco:CharacterString>
              </gmd:city>
              <gmd:administrativeArea>
                <gco:CharacterString>NC</gco:CharacterString>
              </gmd:administrativeArea>
              <gmd:postalCode>
                <gco:CharacterString>28801-5001</gco:CharacterString>
              </gmd:postalCode>
              <gmd:country>
                <gco:CharacterString>USA</gco:CharacterString>
              </gmd:country>
              <gmd:electronicMailAddress>
                <gco:CharacterString>NODC.DataOfficer@noaa.gov</gco:CharacterString>
              </gmd:electronicMailAddress>
            </gmd:CI_Address>
          </gmd:address>
          <gmd:onlineResource>
            <gmd:CI_OnlineResource>
              <gmd:linkage>
                <gmd:URL>https://www.ncei.noaa.gov/</gmd:URL>
              </gmd:linkage>
              <gmd:protocol>
                <gco:CharacterString>HTTPS</gco:CharacterString>
              </gmd:protocol>
              <gmd:name>
                <gco:CharacterString>NOAA National Centers for Environmental Information website</gco:CharacterString>
              </gmd:name>
              <gmd:description>
                <gco:CharacterString>Main NCEI website providing links to access data and data services.</gco:CharacterString>
              </gmd:description>
              <gmd:function>
                <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="information">information</gmd:CI_OnLineFunctionCode>
              </gmd:function>
            </gmd:CI_OnlineResource>
          </gmd:onlineResource>
        </gmd:CI_Contact>
      </gmd:contactInfo>
      <gmd:role>
        <gmd:CI_RoleCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_RoleCode" codeListValue="custodian">custodian</gmd:CI_RoleCode>
      </gmd:role>
    </gmd:CI_ResponsibleParty>
  </gmd:contact>
  <gmd:dateStamp>
    <gco:DateTime>2019-04-20T04:14:14Z</gco:DateTime>
  </gmd:dateStamp>
  <gmd:metadataStandardName>
    <gco:CharacterString>ISO 19115-2 Geographic Information - Metadata - Part 2: Extensions for Imagery and Gridded Data</gco:CharacterString>
  </gmd:metadataStandardName>
  <gmd:metadataStandardVersion>
    <gco:CharacterString>ISO 19115-2:2009(E)</gco:CharacterString>
  </gmd:metadataStandardVersion>
  <gmd:distributionInfo>
    <gmd:MD_Distribution>
      <gmd:distributor>
        <gmd:MD_Distributor>
          <gmd:distributorContact>
            <gmd:CI_ResponsibleParty>
              <gmd:organisationName>
                <gmx:Anchor xlink:href="https://www.nodc.noaa.gov/cgi-bin/OAS/prd/institution/details/1730" xlink:actuate="onRequest">DOC/NOAA/NESDIS/NCEI &gt; National Centers for Environmental Information, NESDIS, NOAA, U.S. Department of Commerce</gmx:Anchor>
              </gmd:organisationName>
              <gmd:contactInfo>
                <gmd:CI_Contact>
                  <gmd:phone>
                    <gmd:CI_Telephone>
                      <gmd:voice>
                        <gco:CharacterString>301-713-3277</gco:CharacterString>
                      </gmd:voice>
                      <gmd:facsimile>
                        <gco:CharacterString>301-713-3300</gco:CharacterString>
                      </gmd:facsimile>
                    </gmd:CI_Telephone>
                  </gmd:phone>
                  <gmd:address>
                    <gmd:CI_Address>
                      <gmd:deliveryPoint>
                        <gco:CharacterString>Federal Building 151 Patton Avenue</gco:CharacterString>
                      </gmd:deliveryPoint>
                      <gmd:city>
                        <gco:CharacterString>Asheville</gco:CharacterString>
                      </gmd:city>
                      <gmd:administrativeArea>
                        <gco:CharacterString>NC</gco:CharacterString>
                      </gmd:administrativeArea>
                      <gmd:postalCode>
                        <gco:CharacterString>28801-5001</gco:CharacterString>
                      </gmd:postalCode>
                      <gmd:country>
                        <gco:CharacterString>USA</gco:CharacterString>
                      </gmd:country>
                      <gmd:electronicMailAddress>
                        <gco:CharacterString>NCEI.Info@noaa.gov</gco:CharacterString>
                      </gmd:electronicMailAddress>
                    </gmd:CI_Address>
                  </gmd:address>
                </gmd:CI_Contact>
              </gmd:contactInfo>
              <gmd:role>
                <gmd:CI_RoleCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_RoleCode" codeListValue="pointOfContact">pointOfContact</gmd:CI_RoleCode>
              </gmd:role>
            </gmd:CI_ResponsibleParty>
          </gmd:distributorContact>
          <gmd:distributionOrderProcess>
            <gmd:MD_StandardOrderProcess>
              <gmd:fees>
                <gco:CharacterString>In most cases, electronic downloads of the data are free. However, fees may apply for custom orders, data certifications, copies of analog materials, and data distribution on physical media.</gco:CharacterString>
              </gmd:fees>
              <gmd:orderingInstructions>
                <gco:CharacterString>Contact NCEI for other distribution options and instructions.</gco:CharacterString>
              </gmd:orderingInstructions>
            </gmd:MD_StandardOrderProcess>
          </gmd:distributionOrderProcess>
          <gmd:distributorFormat>
            <gmd:MD_Format>
              <gmd:name>
                <gco:CharacterString>Originator data format</gco:CharacterString>
              </gmd:name>
              <gmd:version gco:nilReason="unknown"/>
            </gmd:MD_Format>
          </gmd:distributorFormat>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>https://doi.org/10.7289/v53f4mvp</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Web browser</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>Dataset Description</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>Navigate directly to the URL for a descriptive web page with download links.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="information">information</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:transferSize>
                <gco:Real>14596.04</gco:Real>
              </gmd:transferSize>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>https://data.nodc.noaa.gov/nodc/archive/data/0164586/</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Web browser</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>Navigate directly to the URL for data access and direct download.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download">download</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:transferSize>
                <gco:Real>14596.04</gco:Real>
              </gmd:transferSize>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>ftp://ftp.nodc.noaa.gov/pub/data.nodc/nodc/archive/data/0164586/</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>FTP</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Any FTP client</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>FTP</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>These data are available through the File Transfer Protocol (FTP). You may use any FTP client to download these data.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download">download</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:transferSize>
                <gco:Real>14596.04</gco:Real>
              </gmd:transferSize>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>https://data.nodc.noaa.gov/thredds/catalog/nodc/archive/data/0164586/</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>THREDDS</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Web browsers can browse THREDDS Data Servers and specialized THREDDS software can enable more sophisticated data access and visualizations.</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>THREDDS</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>These data are available through a variety of services via a THREDDS (Thematic Real-time Environmental Distributed Data Services) Data Server (TDS). Depending on the dataset, the TDS can provide WMS, WCS, DAP, HTTP, and other data access and metadata services as well. For more information on the TDS, see http://www.unidata.ucar.edu/software/thredds/current/tds/.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download">download</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>https://accession.nodc.noaa.gov/oas/164586</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Web browser</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>Descriptive Information</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>Navigate directly to the URL for a descriptive web page with download links.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="information">information</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:transferSize>
                <gco:Real>14596.04</gco:Real>
              </gmd:transferSize>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>https://accession.nodc.noaa.gov/download/164586</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Web browser</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>HTTPS</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>Navigate directly to the URL for data access and direct download.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download">download</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
          <gmd:distributorTransferOptions>
            <gmd:MD_DigitalTransferOptions>
              <gmd:transferSize>
                <gco:Real>14596.04</gco:Real>
              </gmd:transferSize>
              <gmd:onLine>
                <gmd:CI_OnlineResource>
                  <gmd:linkage>
                    <gmd:URL>ftp://ftp.nodc.noaa.gov/nodc/archive/arc0112/0164586/</gmd:URL>
                  </gmd:linkage>
                  <gmd:protocol>
                    <gco:CharacterString>FTP</gco:CharacterString>
                  </gmd:protocol>
                  <gmd:applicationProfile>
                    <gco:CharacterString>Any FTP client</gco:CharacterString>
                  </gmd:applicationProfile>
                  <gmd:name>
                    <gco:CharacterString>FTP</gco:CharacterString>
                  </gmd:name>
                  <gmd:description>
                    <gco:CharacterString>These data are available through the File Transfer Protocol (FTP). You may use any FTP client to download these data.</gco:CharacterString>
                  </gmd:description>
                  <gmd:function>
                    <gmd:CI_OnLineFunctionCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download">download</gmd:CI_OnLineFunctionCode>
                  </gmd:function>
                </gmd:CI_OnlineResource>
              </gmd:onLine>
            </gmd:MD_DigitalTransferOptions>
          </gmd:distributorTransferOptions>
        </gmd:MD_Distributor>
      </gmd:distributor>
    </gmd:MD_Distribution>
  </gmd:distributionInfo>
  <gmd:dataQualityInfo>
  </gmd:dataQualityInfo>
  <gmd:metadataMaintenance>
    <gmd:MD_MaintenanceInformation>
      <gmd:maintenanceAndUpdateFrequency>
        <gmd:MD_MaintenanceFrequencyCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#MD_MaintenanceFrequencyCode" codeListValue="asNeeded">asNeeded</gmd:MD_MaintenanceFrequencyCode>
      </gmd:maintenanceAndUpdateFrequency>
      <gmd:maintenanceNote>
        <gco:CharacterString>Metadata are developed, maintained and distributed by NCEI. Updates are performed as needed to maintain currentness.</gco:CharacterString>
      </gmd:maintenanceNote>
      <gmd:maintenanceNote>
        <gco:CharacterString>NCEI Accession 0164586 was revised and a new version of the archival package was published. Updates to existing archival packages may provide additional files or replace obsolete files. The latest version contains the most complete and up-to-date representation of this archival information package. All of the files received prior to this update are available in the preceding version of this accession. Please see journal.txt in the /about directory for additional details on changes made.</gco:CharacterString>
      </gmd:maintenanceNote>
      <gmd:contact>
        <gmd:CI_ResponsibleParty>
          <gmd:organisationName>
            <gco:CharacterString>DOC/NOAA/NESDIS/NCEI &gt; National Centers for Environmental Information, NESDIS, NOAA, U.S. Department of Commerce</gco:CharacterString>
          </gmd:organisationName>
          <gmd:role>
            <gmd:CI_RoleCode codeList="https://data.noaa.gov/resources/iso19139/schema/resources/Codelist/gmxCodelists.xml#CI_RoleCode" codeListValue="custodian">custodian</gmd:CI_RoleCode>
          </gmd:role>
        </gmd:CI_ResponsibleParty>
      </gmd:contact>
    </gmd:MD_MaintenanceInformation>
  </gmd:metadataMaintenance>
</gmi:MI_Metadata>

""", data_managers: "Goobie", last_updated: 2018-01-01)

		String id
		String uuid
		String configurations
		String iso_xml
		String data_managers
		Date last_updated


	}
	def destroy = {
	}
}
