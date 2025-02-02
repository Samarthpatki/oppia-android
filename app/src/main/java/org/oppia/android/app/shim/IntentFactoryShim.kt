package org.oppia.android.app.shim

import android.content.Context
import android.content.Intent

/**
 * Creates intents for ViewModels in order to avoid ViewModel files directly depending on Activites.
 * When working on a ViewModel file, developers should refrain from directly referencing Activities
 * by adding all Intent functionality here.
 *
 * Please note that this file is temporary and all functionality will be returned to its respective
 * ViewModel once Gradle has been removed.
 */
// TODO(#1619): Remove file post-Gradle
interface IntentFactoryShim {
  /**
   * Creates a [TopicActivity] intent for [PromotedStoryViewModel] and passes necessary string
   * data.
   */
  fun createTopicPlayStoryActivityIntent(
    context: Context,
    internalProfileId: Int,
    classroomId: String,
    topicId: String,
    storyId: String
  ): Intent

  /**
   * Creates a [TopicActivity] intent which opens info-tab.
   */
  fun createTopicActivityIntent(
    context: Context,
    internalProfileId: Int,
    classroomId: String,
    topicId: String
  ): Intent
}
