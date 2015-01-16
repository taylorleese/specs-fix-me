## specs-fix-me

Contains example failing specs that need fixing.

### Running tests

    $ git clone git@github.com:taylorleese/specs-fix-me.git
    $ cd specs-fix-me
    $ sbt
    
    > test
    [info] CoinSpecs
    [info] 
    [info]   Find the minimum number of coins for a value X given a list of denominations.
    [info] 
    [info]   x Denominations: [1], Value: 12, Expected: 12
    [error]  '-1' is not equal to '12' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [1, 2, 3], Value: 6, Expected: 2
    [error]  '-1' is not equal to '2' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [1, 3, 4], Value: 6, Expected: 2
    [error]  '-1' is not equal to '2' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [4, 3, 1], Value: 6, Expected: 2
    [error]  '-1' is not equal to '2' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [1, 5, 10, 25], Value: 41, Expected: 4
    [error]  '-1' is not equal to '4' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [1, 4, 5, 15], Value: 8, Expected: 2
    [error]  '-1' is not equal to '2' (CoinSpecs.scala:27)
    [info] 
    [info]   x Denominations: [15, 1, 5, 4], Value: 8, Expected: 2
    [error]  '-1' is not equal to '2' (CoinSpecs.scala:27)
    [info] 
    [info] 
    [info] Total for specification CoinSpecs
    [info] Finished in 17 ms
    [info] 7 examples, 7 failures, 0 error
    [info]  
    [error] Failed: Total 7, Failed 7, Errors 0, Passed 0
    [error] Failed tests:
    [error] 	com.specsfixme.tests.CoinSpecs
    [error] (test:test) sbt.TestsFailedException: Tests unsuccessful
    [error] Total time: 8 s, completed Jan 16, 2015 12:04:45 PM

Expected output after fixing the specs:

    > test
    [info] CoinSpecs
    [info] 
    [info]   Find the minimum number of coins for a value X given a list of denominations.
    [info] 
    [info]   + Denominations: [1], Value: 12, Expected: 12
    [info]   + Denominations: [1, 2, 3], Value: 6, Expected: 2
    [info]   + Denominations: [1, 3, 4], Value: 6, Expected: 2
    [info]   + Denominations: [4, 3, 1], Value: 6, Expected: 2
    [info]   + Denominations: [1, 5, 10, 25], Value: 41, Expected: 4
    [info]   + Denominations: [1, 4, 5, 15], Value: 8, Expected: 2
    [info]   + Denominations: [15, 1, 5, 4], Value: 8, Expected: 2
    [info] 
    [info] Total for specification CoinSpecs
    [info] Finished in 17 ms
    [info] 7 examples, 0 failure, 0 error
    [info]  
    [info] Passed: Total 7, Failed 0, Errors 0, Passed 7
