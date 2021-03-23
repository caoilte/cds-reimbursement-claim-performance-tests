/*
 * Copyright 2021 HM Revenue & Customs
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
 * limitations under the License.
 */

package uk.gov.hmrc.perftests.cdsrc

import uk.gov.hmrc.performance.simulation.PerformanceTestRunner
import uk.gov.hmrc.perftests.cdsrc.EntryNumberRequests._
import uk.gov.hmrc.perftests.cdsrc.MRNNumberRequests._

class CDSRSimulation extends PerformanceTestRunner {

  setup("Entry-number-journey", "Entry number journey") withActions
    (
      getAuthLoginPage,
      loginWithAuthLoginStub(),
      getCdsrStartPage,
      getMRNPage,
      postMRNPage,
      getEnterDeclarationDetails,
      postEnterDeclarationDetails,
      getWhoIsDeclarantPage,
      postWhoIsDeclarantPage,
      getEnterClaimantDetailsAsIndividualPage,
      postEnterClaimantDetailsAsIndividualPage,
      getEnterClaimantDetailsAsCompanyPage,
      postEnterClaimantDetailsAsCompanyPage,
      getEnterReasonForClaimAndBasisPage,
      postEnterReasonForClaimAndBasisPage,
      getEnterCommodityDetailsPage,
      postEnterCommodityDetailsPage,
      getSelectDutiesPage,
      postSelectDutiesPage,
      getStartClaimPage,
      getEnterClaimPage,
      postEnterClaimPage,
      getCheckClaimPage,
      postCheckClaimPage,
      getEnterBankAccountDetailsPage,
      PostEnterBankAccountDetailsPage,
      getUploadSupportEvidencePage,
      postUploadSupportEvidencePage,
      getScanProgressWaitPage,
      postScanProgressWaitPage,
      postScanProgressWaitPage1,
//      getSelectSupportingEvidencePage,
//      postSelectSupportingEvidencePage,
//      getCheckYourAnswersPage,
//      postCheckYourAnswersPage,
//      getReviewYourClaimPage,
//      postReviewYourClaimPage
    )
  setup("MRN-journey", "Movement reference number journey") withRequests
    (
      getMRNAuthLoginPage,
      loginWithAuthLoginStubMRN(),
      getMRNCdsrStartPage,
      getTheMRNPage,
      postTheMRNPage,
      getTheMRNImporterEoriEntryPage,
      postTheMRNImporterEoriEntryPage,
      getTheMRNDeclarantEoriEntryPage,
      postTheMRNDeclarantEoriEntryPage,
      getTheMRNCheckDeclarationPage,
      postTheMRNCheckDeclarationPage,
      getTheMRNWhoIsDeclarantPage,
      postTheMRNWhoIsDeclarantPage,
      getTheMRNEnterClaimantDetailsAsIndividualPage,
      postTheMRNEnterClaimantDetailsAsIndividualPage,
      getTheMRNEnterClaimantDetailsAsCampanyPage,
      postTheMRNEnterClaimantDetailsAsCampanyPage,
      getTheMRNChooseBasisOfClaimPage,
      postTheMRNChooseBasisOfClaimPage,
      getTheMRNEnterCommodityDetailsPage,
      postTheMRNEnterCommodityDetailsPage,
      getTheMRNSelectDutiesPage,
      postTheMRNSelectDutiesPage,
      getTheMRNStartClaimPage,
      getTheMRNEnterClaimPage,
      postTheMRNEnterClaimPage,
      getTheMRNCheckClaimPage,
      postTheMRNCheckClaimPage,
      getTheMRNCheckTheseBankDetailsAreCorrectPage,
      postTheMRNCheckTheseBankDetailsAreCorrectPage,

    )


  runSimulation()
}
