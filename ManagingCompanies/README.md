# Managing Companies

The API provides a number of methods for retrieving and updating companies. See the following chart for details. For POST methods, the company data structure can be seen below the table.

*Note: all POST bodies should be formatted as JSON string.*
| Description             | Method | URL                                     | Parameters
| :---------------------- | :----- | :-------------------------------------- | :---------
| [List companies](/ManagingCompanies/ListCompanies)          | GET    | /companies/?start={start}&limit={limit} | <ul><li>start - the starting value for the paginated results</li><li>limit - the number of records to return</li><li>filter - any filters to apply on the data.  See [here](/#Filters) for more information.</li></ul>
| [Load a specific company](/ManagingCompanies/LoadingACompanyWithACompanyID) | GET    | /companies/{companyId}                  | <ul><li>companyId - the ID of the company to load</li></ul>
| [Update a company](/ManagingCompanies/UpdatingACompany)        | POST   | /companies/{companyId}                  | <ul><li>companyId - the ID of the company to update</li><li>POST body - the JSON representation of the company; see below for details</li></ul>
| [Create a company](/ManagingCompanies/CreatingACompany)        | POST   | /companies/create                       | <ul><li>companyId - the ID of the company to update</li><li>POST body - the JSON representation of the company; see below for details</li></ul>

Companies contain the following structure (only partial properties are shown here).  Almost all properties can be modified using an UPDATE command. The company key can be set during CREATE only. Any items that can be set during UPDATE can be set during CREATE. 

Updates to companies are partial.  That is, any values **not** sent in the request will be left untouched.
| Parameter | Type    | Description | Example value
| :-------- | :------ | :---------- | :------------
| active  | boolean | Whether a company is active or not | ```true```
| address | String  | Address of the company              | ```"1234 Main St"```
| city | String  | The city where the company is located | ```"San Francisco"```
| state | String  | The state/province where the company is located | ```"CA"```
| country | String  | The country where the company is located | ```"United States"```
| zip | String | The ZIP code of the company (if the country uses ZIP codes) | ```94109```
| domain | String | The URL of the company's website | ```"https://example.com/"```