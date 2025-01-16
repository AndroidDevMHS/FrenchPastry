package info.alirezaahmadi.frenchpastry.mvp.model

import info.alirezaahmadi.frenchpastry.data.remote.apiRepository.CatsApiRepository
import info.alirezaahmadi.frenchpastry.data.remote.dataModel.ParentCategoryModel
import info.alirezaahmadi.frenchpastry.data.remote.ext.CallbackRequest

class ModelPastryCatsFragment {

    fun getCats(callbackRequest: CallbackRequest<ParentCategoryModel>) {
        CatsApiRepository.instance.getCategories(callbackRequest, CatsApiRepository.PASTRY_TYPE)
    }

}