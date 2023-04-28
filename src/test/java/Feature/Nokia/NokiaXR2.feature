Feature: Tariff Refresh-Phone Nokia

  Scenario Outline:  Verify the Tariff of mobile product-Nokia
    Given user is on online business shop home page
    When user hover on shop and clicks on All phones icon
    Then user select Nokia brand under Filter section
    Then user is navigated to Business Mobile Phones and user select the <serial number> "<phone>"
    Then user is navigated to phone description page and click on view all tariffs
    Then user is navigated to tariffs and extras page for verifies the 36 month tariffs
    Then compare the 36month- 20GB tariff values with pricing matrix <36upfront_20GB> <36month_20GB>
    Then compare the 36month- 3GB tariff values with pricing matrix <36upfront_3GB> <36month_3GB>
    Then compare the 36month- 6GB tariff values with pricing matrix <36upfront_6GB> <36month_6GB>
    Then compare the 36month- 70GB tariff values with pricing matrix <36upfront_70GB> <36month_70GB>
    Then compare the 36month- Unlimited tariff values with pricing matrix <36upfront_unlimited> <36month_unlimited>
    Then click on 24 months tariff button
    Then compare the 24month- 20GB tariff values with pricing matrix <24upfront_20GB> <24month_20GB>
    Then compare the 24month- 3GB tariff values with pricing matrix <24upfront_3GB> <24month_3GB>
    Then compare the 24month- 6GB tariff values with pricing matrix <24upfront_6GB> <24month_6GB>
    Then compare the 24month- 70GB tariff values with pricing matrix <24upfront_70GB> <24month_70GB>
    Then compare the 24month- Unlimited tariff values with pricing matrix <24upfront_unlimited> <24month_unlimited>

    Examples:
      |serial number|phone                   |memory  |36upfront_3GB|36month_3GB|36upfront_6GB|36month_6GB|36upfront_20GB|36month_20GB|36upfront_70GB|36month_70GB|36upfront_unlimited|36month_unlimited|24upfront_3GB|24month_3GB|24upfront_6GB|24month_6GB|24upfront_20GB|24month_20GB|24upfront_70GB|24month_70GB|24upfront_unlimited|24month_unlimited|
      |3            |Nokia XR2               |256     |10           |28         |10           |31         |10            |34          |10            |37          |10                 |41               |10           |28         |10           |31         |10            |34          |20            |37          |10                 |41               |
