// Exported from:        http://Chandra-PC:5516/#/templates/Folderb65eece1b8284e4883a36b6c710c0856-Folderd26024d30f7f48a4a39babcaa26f32a1-Release74990ccf911b48ea9a27eaa3c2db209b/releasefile
// XL Release version:   9.6.1
// Date created:         Sun May 24 18:08:06 IST 2020

xlr {
  template('Pipeline template') {
    folder('XL DevOps/Delivery 1')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-05-24T09:00:00+0530')
    phases {
      phase('Release template 1') {
        color '#0079BC'
        tasks {
          manual('phase1') {
            
          }
          manual('phase2') {
            
          }
        }
      }
    }
    
  }
}